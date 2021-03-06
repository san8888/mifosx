/**
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mifosplatform.portfolio.savingsaccount.data;

import java.math.BigDecimal;
import java.util.Collection;

import org.mifosplatform.organisation.monetary.data.CurrencyData;

public class SavingScheduleData {

    private final CurrencyData currency;
    private final BigDecimal cumulativeDepositDue;
    private final BigDecimal cumulativeDepositPaid;
    private final BigDecimal cummulativeInterestAccured;
    private final Collection<SavingSchedulePeriodData> periods;

    public SavingScheduleData(final CurrencyData currency, final BigDecimal cumulativeDepositDue, final BigDecimal cumulativeDepositPaid, 
    		final BigDecimal cummulativeInterestAccured, final Collection<SavingSchedulePeriodData> periods) {
        this.currency = currency;
        this.cumulativeDepositDue = cumulativeDepositDue;
        this.cumulativeDepositPaid = cumulativeDepositPaid;
        this.cummulativeInterestAccured = cummulativeInterestAccured;
        this.periods = periods;

    }

    public CurrencyData getCurrency() {
        return this.currency;
    }

    public BigDecimal getCumulativeDepositDue() {
        return this.cumulativeDepositDue;
    }

    public BigDecimal getCumulativeDepositPaid() {
		return this.cumulativeDepositPaid;
	}

	public BigDecimal getCummulativeInterestAccured() {
		return this.cummulativeInterestAccured;
	}

	public Collection<SavingSchedulePeriodData> getPeriods() {
        return this.periods;
    }

}
