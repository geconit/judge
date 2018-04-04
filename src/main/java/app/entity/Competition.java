package app.entity;

import jdk.nashorn.internal.parser.DateParser;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "competition")
public class Competition {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "competition_name")
    private String name;

    @Column(name = "venue")
    private String venue;

    @Column(name = "competition_code")
    private String code;

    @Column(name = "maps_url")
    private String mapUrl;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "slalom")
    private Boolean slalom;

    @Column(name = "tricks")
    private Boolean trick;

    @Column(name = "jump")
    private Boolean jump;

    @Column(name= "seson")
    private Integer season;

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMapUrl() {
        return mapUrl;
    }

    public void setMapUrl(String mapUrl) {
        this.mapUrl = mapUrl;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Boolean getSlalom() {
        return slalom;
    }

    public void setSlalom(Boolean slalom) {
        this.slalom = slalom;
    }

    public Boolean getTrick() {
        return trick;
    }

    public void setTrick(Boolean trick) {
        this.trick = trick;
    }

    public Boolean getJump() {
        return jump;
    }

    public void setJump(Boolean jump) {
        this.jump = jump;
    }
}
