package pl.order.management.model.entities;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Position {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String positions;

    public Long getId() {
        return id;
    }

    public String getPositions() {
        return positions;
    }

    public void setPositions(String positions) {
        this.positions = positions;
    }

    @Override
    public String toString() {
        return "Position{" +
                "id=" + id +
                ", positions='" + positions + '\'' +
                '}';
    }
}
