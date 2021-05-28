package kom.task.web.dto.daydo;

import kom.task.domain.dailydo.daydo.Daydo;
import lombok.Getter;

@Getter
public class DaydoResponseDto {

    private Long id;
    private Integer day;
    private String content;

    public DaydoResponseDto(Daydo entity) {
        this.id = entity.getId();
        this.day = entity.getDay();
        this.content = entity.getContent();
    }
}
