package pl.order.management.model.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class Status {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String statuses;

    public Long getId() {
        return id;
    }

    public String getStatuses() {
        return statuses;
    }

    public void setStatus(String statuses) {
        this.statuses = statuses;
    }

    @Override
    public String toString() {
        return "Status{" +
                "id=" + id +
                ", status='" + statuses + '\'' +
                '}';
    }
}
