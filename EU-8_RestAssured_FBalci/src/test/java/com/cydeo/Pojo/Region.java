package com.cydeo.Pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString


public class Region {
    @JsonProperty("region_id")
    private int regionID;
    @JsonProperty("region_name")
    private String RN ;
    @JsonProperty("links")
    private List<Link> LNK;

    /*
    @Override
    public String toString() {
        return "Region{" +
                "region_id=" + region_id +
                ", region_name='" + region_name + '\'' +
                ", links=" + links +
                '}';
    }

    public int getRegion_id() {
        return region_id;
    }

    public void setRegion_id(int region_id) {
        this.region_id = region_id;
    }

    public String getRegion_name() {
        return region_name;
    }

    public void setRegion_name(String region_name) {
        this.region_name = region_name;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

     */
}
