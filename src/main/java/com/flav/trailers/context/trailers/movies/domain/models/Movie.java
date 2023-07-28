package com.flav.trailers.context.trailers.movies.domain.models;

import com.flav.trailers.context.trailers.genders.domain.models.Gender;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Movie {

    private Long id;
    private String name;
    private String description;
    private String image;
    private String video;
    private Date releaseDate;
    private List<Gender> gender = new ArrayList<>();

}
