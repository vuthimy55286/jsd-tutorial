package tut02.WebSearching;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.net.URI;

public class WebSearching {
    private static final String PHRASE = "Java Software Development";
    private static final Pattern LINK_PATTERN = Pattern.compile("href=\"(.*?)\"", Pattern.CASE_INSENSITIVE);

    public static void main(String[] args) {
        String startUrl = "https://lms.fit.hanu.vn/?lang=en";
        searchForPhrase(startUrl, PHRASE);
    }

    public static void searchForPhrase(String startUrl, String phrase) {
        Set<String> visited = new HashSet<>();
        Queue<String> toVisit = new LinkedList<>();
        toVisit.add(startUrl);

        while (!toVisit.isEmpty()) {
            String url = toVisit.poll();
            if (visited.contains(url)) {
                continue;
            }
            visited.add(url);

            try {
                HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
                connection.setRequestMethod("GET");
                connection.setInstanceFollowRedirects(true);
                connection.setConnectTimeout(5000);
                connection.setReadTimeout(5000);

                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder content = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
                in.close();

                if (content.toString().contains(phrase)) {
                    System.out.println("Phrase '" + phrase + "' found at: " + url);
                    return;
                }

                Matcher matcher = LINK_PATTERN.matcher(content);
                while (matcher.find()) {
                    String foundUrl = matcher.group(1);
                    if (!foundUrl.startsWith("http")) {
                        URI baseUri = new URI(url);
                        foundUrl = baseUri.resolve(foundUrl).toString();
                    }

                    if (!visited.contains(foundUrl)) {
                        toVisit.add(foundUrl);
                    }
                }
            } catch (Exception e) {
                System.out.println("Failed to retrieve " + url + ": " + e.getMessage());
            }
        }

        System.out.println("Phrase '" + phrase + "' not found starting from " + startUrl);
    }
}
