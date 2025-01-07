package io.gorse.gorse4j;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Neighbor {
    private String Id;
    private double Score;

    // Getters and Setters
    @JsonProperty("Id")
    public String getId() {
        return Id;
    }

    public void setId(String id) {
        this.Id = id;
    }

    @JsonProperty("Score")
    public double getScore() {
        return Score;
    }

    public void setScore(double score) {
        this.Score = score;
    }
} 