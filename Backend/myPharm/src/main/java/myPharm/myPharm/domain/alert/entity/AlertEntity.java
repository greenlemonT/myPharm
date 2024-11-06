package myPharm.myPharm.domain.alert.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import myPharm.myPharm.domain.ingredient.entity.IngredientEntity;
import myPharm.myPharm.global.AlertEnum;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AlertEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ingredient_name")
    private IngredientEntity ingredient;

    private AlertEnum typeName;

    private String content;


}
