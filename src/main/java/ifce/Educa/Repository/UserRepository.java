package ifce.Educa.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ifce.Educa.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
