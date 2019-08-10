package pl.order.management.model.entities;


import javax.persistence.*;

@Entity
@Table(name = "positions")
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String positions;

    public Position() {
    }

    public Position(String positions) {
        this.positions = positions;
    }

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
