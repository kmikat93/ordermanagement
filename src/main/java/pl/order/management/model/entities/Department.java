package pl.order.management.model.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String departments;

    public Long getId() {
        return id;
    }

    public String getDepartment() {
        return departments;
    }

    public void setDepartment(String departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", department='" + departments + '\'' +
                '}';
    }
}
