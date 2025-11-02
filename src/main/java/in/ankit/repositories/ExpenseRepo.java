package in.ankit.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ankit.entities.Expense;

public interface ExpenseRepo extends JpaRepository<Expense, Long> {
    List<Expense> findByGroupId(Long groupId);
    List<Expense> findByPayerId(Long payerId);
}
