package pro.beam.api.resource.channel;

import java.util.Date;

import com.google.gson.annotations.SerializedName;

public class BeamChannel {
    public CostreamPreference allowCostream;
    public AudienceRating audience;
    public String description;
    public Date createdAt;
    public boolean featured;
    public int numFollowers;
    public boolean hidden;
    public int id;
    public String name;
    public boolean online;
    public boolean partnered;
    public int numSubscribers;
    public String token;
    public String type;
    public Date updatedAt;
    public int userId;
    public int viewersCurrent;
    public int viewersTotal;

    public static enum CostreamPreference {
        @SerializedName("all") ALL,
        @SerializedName("following") FOLOWING,
        @SerializedName("none") NONE
    }

    public static enum AudienceRating {
        G, PG, PG13, R
    }
}