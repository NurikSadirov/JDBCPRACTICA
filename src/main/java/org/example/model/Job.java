package org.example.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Job {
    private Long id;
    private String position;
    private String profession;
    private String description;
    private int experience;

    public Job(String position, String profession, String description, int experience) {
        this.position = position;
        this.profession = profession;
        this.description = description;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "\nJob{" +
                "id: " + id +
                ", position: " + position + '\'' +
                ", profession: " + profession + '\'' +
                ", description: " + description + '\'' +
                ", experience: " + experience +
                '}';
    }
}
