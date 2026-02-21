package study.datajpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class MemberJpaRepository {

    @PersistenceContext
    private EntityManager em;

    public MemberOld save(MemberOld member) {
        em.persist(member);
        return member;
    }

    public MemberOld find(Long id) {
        return em.find(MemberOld.class, id);
    }
}
