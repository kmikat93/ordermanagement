package pl.order.management.model.entities;

import javax.persistence.*;

@Entity
@Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, columnDefinition = "TEXT")
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
