package pl.order.management.model.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class Department {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column()
    private Long id;
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
