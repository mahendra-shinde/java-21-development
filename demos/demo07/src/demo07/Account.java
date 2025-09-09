package demo07;

import java.time.LocalDate;

public record Account(Integer accId, String customer, LocalDate openingDate, double balance) {

	@Override
	public boolean equals(Object next) {
		if (next instanceof Account) {
			return this.accId() == ((Account) next).accId();
		} else
			return false;
	}

	@Override
	public final int hashCode() {
		return this.accId() * 17;
	}
}
