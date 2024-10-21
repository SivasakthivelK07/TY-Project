package com.tyss.qspiders.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tyss.qspiders.entity.BankAccount;

public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {

	@Modifying
	@Query(value = "UPDATE BankAccount b SET b.ifsc = :ifsc WHERE b.accountno = :accountno")
	int updateBankAccountByEmployeeId(
			@Param("accountno") long accountno,
			@Param("ifsc") String ifsc
	);

	@Modifying
	@Query(value = "DELETE FROM BankAccount b")
	int deleteBankAccount(BankAccount backAccount);

}
