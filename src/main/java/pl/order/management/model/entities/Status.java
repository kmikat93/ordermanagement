package pl.order.management.model.entities;

import javax.persistence.*;

@Entity
@Table(name = "statuses")
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String status;

    public Long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String statuses) {
        this.status = statuses;
    }

    @Override
    public String toString() {
        return "Status{" +
                "id=" + id +
                ", status='" + status + '\'' +
                '}';
    }
}
