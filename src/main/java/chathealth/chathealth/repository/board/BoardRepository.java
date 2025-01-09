package chathealth.chathealth.repository.board;

import chathealth.chathealth.entity.board.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BoardRepository extends JpaRepository<Board, Long>, BoardRepositoryCustom {

    @Modifying
    @Query("update Board b SET b.hit = b.hit + :increment WHERE b.id = :boardId")
    void updateHitCount(@Param("boardId") Long boardId, @Param("increment") Long increment);
}