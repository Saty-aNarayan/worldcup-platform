package com.worldcup.downloader;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class TournamentDownloader {

    private static final String URL =
            "https://raw.githubusercontent.com/openfootball/worldcup/master/2026--usa/cup.txt";

    public String downloadTournamentData() {

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URL))
                .GET()
                .build();

        try {

            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());

            return response.body();

        } catch (IOException | InterruptedException e) {

            throw new RuntimeException("Failed to download tournament data.", e);

        }
    }
}