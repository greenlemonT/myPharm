package myPharm.myPharm.domain.medbox.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import myPharm.myPharm.domain.medicine.entity.MedicineEntity;
import myPharm.myPharm.domain.user.entity.UserEntity;

import java.time.DateTimeException;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MedboxEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UserEntity user;

    private Date startDate;

    private Date endDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "medicine_name")
    private MedicineEntity medicine;

}
