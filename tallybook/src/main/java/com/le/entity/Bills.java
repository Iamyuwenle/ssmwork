package com.le.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bills {
    private Integer id;

    private String title;


    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date billTime;

    private Integer typeId;

    private Double price;

    private String explains;
}