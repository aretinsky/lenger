package org.aretinsky.lenger.dto.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaskDto {
    private Integer id;

    private String title;

    private String author;

    //link to github file with task description
    private String github_description;

    //link to github file with task solution
    private String github_solution;

    private int success_count;

    private int attempts_count;

    private double difficult_level;

}
