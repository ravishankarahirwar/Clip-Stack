package com.satinpod.copyhistory;

import java.util.Date;

/**
 * @author Ravishankar Ahirwar
 * @since 13/03/2018
 */

public class ClipObject {

    public final static String markStar = "☆★☆";

    protected String text;
    protected Date date;
    protected boolean star;

    public ClipObject(String text, Date date) {
        this.text = text;
        this.date = date;
        this.star = false;
    }
    public ClipObject(String text, Date date, boolean star) {
        this.text = text;
        this.date = date;
        this.star = star;
    }
    public String getText() {
        return text;
    }
    public Date getDate() {
        return date;
    }
    public  boolean isStarred() {
        return star;
    }
    public ClipObject setStarred(boolean isStarred) {
        this.star = isStarred;
        return this;
    }
}

