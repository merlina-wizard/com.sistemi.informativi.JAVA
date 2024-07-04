package com.sistemi.informarivi.VO;

import java.io.Serializable;

public class CourseVO implements Serializable {

    private String title;

    private int id;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CourseVO(String title, int id) {
        this.title = title;
        this.id = id;
    }

    @Override
    public String toString() {
        return "CourseVO{" +
                "title='" + title + '\'' +
                ", id=" + id +
                '}';
    }

}
