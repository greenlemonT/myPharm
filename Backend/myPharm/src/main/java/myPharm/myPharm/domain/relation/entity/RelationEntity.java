package myPharm.myPharm.domain.relation.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import myPharm.myPharm.domain.ingredient.entity.IngredientEntity;
import myPharm.myPharm.domain.medicine.entity.MedicineEntity;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RelationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ingredient_name")
    private IngredientEntity ingredient;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "medicine_name")
    private MedicineEntity medicine;


}
