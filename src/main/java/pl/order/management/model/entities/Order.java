package pl.order.management.model.entities;

import java.time.LocalDateTime;
import java.util.Date;

public class Order {
    private Long id;
    private String title;
    private String description;
    private Status status;
    private User userId;
    private Department departmentId;
    private LocalDateTime dateTime;




}
