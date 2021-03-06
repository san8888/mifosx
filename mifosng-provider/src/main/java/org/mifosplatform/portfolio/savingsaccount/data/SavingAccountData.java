/**
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mifosplatform.portfolio.savingsaccount.data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.joda.time.LocalDate;
import org.mifosplatform.infrastructure.core.data.EnumOptionData;
import org.mifosplatform.organisation.monetary.data.CurrencyData;
import org.mifosplatform.portfolio.savingsaccountproduct.data.SavingProductLookup;

/**
 * Immutable data object representing a savings account.
 */
public class SavingAccountData {

    private final Long id;
    private final EnumOptionData status;
    private final String externalId;
    private final Long clientId;
    private final String clientName;
    private final Long productId;
    private final String productName;
    private final EnumOptionData productType;
    private final CurrencyData currencyData;
    private final BigDecimal savingsDepositAmountPerPeriod;
    private final EnumOptionData savingsFrequencyType;
    private final BigDecimal totalDepositAmount;
    private final BigDecimal recurringInterestRate;
    private final BigDecimal savingInterestRate;
    private final EnumOptionData interestType;
    private final EnumOptionData interestCalculationMethod;
    private final Integer tenure;
    private final EnumOptionData tenureType;
    private final LocalDate projectedCommencementDate;
    private final LocalDate actualCommencementDate;
    private final LocalDate maturesOnDate;
    private final BigDecimal projectedInterestAccuredOnMaturity;
    private final BigDecimal actualInterestAccured;
    private final BigDecimal projectedMaturityAmount;
    private final BigDecimal actualMaturityAmount;
    private final boolean preClosureAllowed;
    private final BigDecimal preClosureInterestRate;
    private final LocalDate withdrawnonDate;
    private final LocalDate rejectedonDate;
    private final LocalDate closedonDate;
    private final boolean isLockinPeriodAllowed;
    private final Integer lockinPeriod;
    private final EnumOptionData lockinPeriodType;
    private final Integer depositEvery;

    private final List<SavingProductLookup> productOptions;
    private final Collection<CurrencyData> currencyOptions;
    private final List<EnumOptionData> savingsProductTypeOptions;
    private final List<EnumOptionData> tenureTypeOptions;
    private final List<EnumOptionData> savingFrequencyOptions;
    private final List<EnumOptionData> savingsInterestTypeOptions;
    private final List<EnumOptionData> lockinPeriodTypeOptions;
    private final List<EnumOptionData> interestCalculationOptions;

    private final Collection<SavingScheduleData> savingScheduleDatas;
    private final SavingPermissionData permissions;
    private final BigDecimal outstandingAmount;
    private final BigDecimal dueAmount;
    private final SavingScheduleData savingScheduleData;
    private final Collection<SavingAccountTransactionsData> transactions;

    private final Integer interestPostEvery;
    private final EnumOptionData interestPostFrequency;

    public static SavingAccountData createFrom(final Long clientId, final String clientDisplayName) {
        return new SavingAccountData(clientId, clientDisplayName);
    }

    public SavingAccountData(final Long id, final EnumOptionData status, final String externalId, final Long clientId,
            final String clientName, final Long productId, final String productName, final EnumOptionData productType,
            final CurrencyData currencyData, final BigDecimal savingsDepositAmountPerPeriod, final EnumOptionData savingsFrequencyType,
            final BigDecimal totalDepositAmount, final BigDecimal recurringInterestRate, final BigDecimal savingInterestRate,
            final EnumOptionData interestType, final EnumOptionData interestCalculationMethod, final Integer tenure,
            final EnumOptionData tenureType, final LocalDate projectedCommencementDate, final LocalDate actualCommencementDate,
            final LocalDate maturesOnDate, final BigDecimal projectedInterestAccuredOnMaturity, final BigDecimal actualInterestAccured,
            final BigDecimal projectedMaturityAmount, final BigDecimal actualMaturityAmount, final boolean preClosureAllowed,
            final BigDecimal preClosureInterestRate, final LocalDate withdrawnonDate, final LocalDate rejectedonDate,
            final LocalDate closedonDate, final boolean isLockinPeriodAllowed, final Integer lockinPeriod,
            final EnumOptionData lockinPeriodType, final Integer depositEvery, final BigDecimal outstandingAmount,
            final Integer interestPostEvery, final EnumOptionData interestPostFrequency) {
        this.id = id;
        this.status = status;
        this.externalId = externalId;
        this.clientId = clientId;
        this.clientName = clientName;
        this.productId = productId;
        this.productName = productName;
        this.productType = productType;
        this.currencyData = currencyData;
        this.savingsDepositAmountPerPeriod = savingsDepositAmountPerPeriod;
        this.savingsFrequencyType = savingsFrequencyType;
        this.totalDepositAmount = totalDepositAmount;
        this.recurringInterestRate = recurringInterestRate;
        this.savingInterestRate = savingInterestRate;
        this.interestType = interestType;
        this.interestCalculationMethod = interestCalculationMethod;
        this.tenure = tenure;
        this.tenureType = tenureType;
        this.projectedCommencementDate = projectedCommencementDate;
        this.actualCommencementDate = actualCommencementDate;
        this.maturesOnDate = maturesOnDate;
        this.projectedInterestAccuredOnMaturity = projectedInterestAccuredOnMaturity;
        this.actualInterestAccured = actualInterestAccured;
        this.projectedMaturityAmount = projectedMaturityAmount;
        this.actualMaturityAmount = actualMaturityAmount;
        this.preClosureAllowed = preClosureAllowed;
        this.preClosureInterestRate = preClosureInterestRate;
        this.withdrawnonDate = withdrawnonDate;
        this.rejectedonDate = rejectedonDate;
        this.closedonDate = closedonDate;
        this.isLockinPeriodAllowed = isLockinPeriodAllowed;
        this.lockinPeriod = lockinPeriod;
        this.lockinPeriodType = lockinPeriodType;
        this.depositEvery = depositEvery;
        this.productOptions = new ArrayList<SavingProductLookup>();
        this.currencyOptions = null;
        this.savingsProductTypeOptions = null;
        this.tenureTypeOptions = null;
        this.savingFrequencyOptions = null;
        this.savingsInterestTypeOptions = null;
        this.lockinPeriodTypeOptions = null;
        this.interestCalculationOptions = null;
        this.savingScheduleDatas = null;
        this.permissions = null;
        this.outstandingAmount = outstandingAmount;
        this.dueAmount = BigDecimal.ZERO;
        this.savingScheduleData = null;
        this.transactions = null;
        this.interestPostEvery = interestPostEvery;
        this.interestPostFrequency = interestPostFrequency;
    }

    public SavingAccountData(final Long clientId, final String clientName) {
        this.id = null;
        this.status = null;
        this.externalId = null;
        this.clientId = clientId;
        this.clientName = clientName;
        this.productId = null;
        this.productName = null;
        this.productType = null;
        this.currencyData = new CurrencyData("USD", "US Dollar", 2, "$", "currency.USD");
        this.savingsDepositAmountPerPeriod = null;
        this.savingsFrequencyType = null;
        this.totalDepositAmount = null;
        this.recurringInterestRate = null;
        this.savingInterestRate = null;
        this.interestType = null;
        this.interestCalculationMethod = null;
        this.tenure = null;
        this.tenureType = null;
        this.projectedCommencementDate = null;
        this.actualCommencementDate = null;
        this.maturesOnDate = null;
        this.projectedInterestAccuredOnMaturity = null;
        this.actualInterestAccured = null;
        this.projectedMaturityAmount = null;
        this.actualMaturityAmount = null;
        this.preClosureAllowed = false;
        this.preClosureInterestRate = null;
        this.withdrawnonDate = null;
        this.rejectedonDate = null;
        this.closedonDate = null;
        this.isLockinPeriodAllowed = false;
        this.lockinPeriod = null;
        this.lockinPeriodType = null;
        this.depositEvery = null;
        this.productOptions = new ArrayList<SavingProductLookup>();
        this.currencyOptions = null;
        this.savingsProductTypeOptions = null;
        this.tenureTypeOptions = null;
        this.savingFrequencyOptions = null;
        this.savingsInterestTypeOptions = null;
        this.lockinPeriodTypeOptions = null;
        this.interestCalculationOptions = null;
        this.savingScheduleDatas = null;
        this.permissions = null;
        this.outstandingAmount = BigDecimal.ZERO;
        this.dueAmount = BigDecimal.ZERO;
        this.savingScheduleData = null;
        this.transactions = null;
        this.interestPostEvery = null;
        this.interestPostFrequency = null;
    }

    public SavingAccountData(final SavingAccountData account, final Collection<SavingProductLookup> productOptions,
            final Collection<CurrencyData> currencyOptions, final List<EnumOptionData> savingsProductTypeOptions,
            final List<EnumOptionData> tenureTypeOptions, final List<EnumOptionData> savingFrequencyOptions,
            final List<EnumOptionData> savingsInterestTypeOptions, final List<EnumOptionData> lockinPeriodTypeOptions,
            final List<EnumOptionData> interestCalculationOptions, final BigDecimal dueAmount) {
        this.id = account.id;
        this.status = account.status;
        this.externalId = account.externalId;
        this.clientId = account.clientId;
        this.clientName = account.clientName;
        this.productId = account.productId;
        this.productName = account.productName;
        this.productType = account.productType;
        this.currencyData = account.currencyData;
        this.savingsDepositAmountPerPeriod = account.savingsDepositAmountPerPeriod;
        this.savingsFrequencyType = account.savingsFrequencyType;
        this.totalDepositAmount = account.totalDepositAmount;
        this.recurringInterestRate = account.recurringInterestRate;
        this.savingInterestRate = account.savingInterestRate;
        this.interestType = account.interestType;
        this.interestCalculationMethod = account.interestCalculationMethod;
        this.tenure = account.tenure;
        this.tenureType = account.tenureType;
        this.projectedCommencementDate = account.projectedCommencementDate;
        this.actualCommencementDate = account.actualCommencementDate;
        this.maturesOnDate = account.maturesOnDate;
        this.projectedInterestAccuredOnMaturity = account.projectedInterestAccuredOnMaturity;
        this.actualInterestAccured = account.actualInterestAccured;
        this.projectedMaturityAmount = account.projectedMaturityAmount;
        this.actualMaturityAmount = account.actualMaturityAmount;
        this.preClosureAllowed = account.preClosureAllowed;
        this.preClosureInterestRate = account.preClosureInterestRate;
        this.withdrawnonDate = account.withdrawnonDate;
        this.rejectedonDate = account.rejectedonDate;
        this.closedonDate = account.closedonDate;
        this.isLockinPeriodAllowed = account.isLockinPeriodAllowed;
        this.lockinPeriod = account.lockinPeriod;
        this.lockinPeriodType = account.lockinPeriodType;
        this.depositEvery = account.depositEvery;

        this.productOptions = (List<SavingProductLookup>) productOptions;
        this.currencyOptions = currencyOptions;
        this.savingsProductTypeOptions = savingsProductTypeOptions;
        this.tenureTypeOptions = tenureTypeOptions;
        this.savingFrequencyOptions = savingFrequencyOptions;
        this.savingsInterestTypeOptions = savingsInterestTypeOptions;
        this.lockinPeriodTypeOptions = lockinPeriodTypeOptions;
        this.interestCalculationOptions = interestCalculationOptions;
        this.dueAmount = dueAmount;

        this.savingScheduleDatas = account.savingScheduleDatas;
        this.permissions = account.permissions;
        this.outstandingAmount = account.outstandingAmount;
        this.savingScheduleData = account.savingScheduleData;
        this.transactions = account.transactions;
        this.interestPostEvery = account.interestPostEvery;
        this.interestPostFrequency = account.interestPostFrequency;
    }

    public SavingAccountData(final Long clientId, final String clientName, final Long productId, final String productName,
            final CurrencyData currency, final BigDecimal interestRate, final BigDecimal savingsDepositAmountPerPeriod,
            final EnumOptionData productType, final EnumOptionData tenureType, final Integer tenure,
            final EnumOptionData savingsFrequencyType, final EnumOptionData interestType, final EnumOptionData interestCalculationMethod,
            final boolean lockinPeriodAllowed, final Integer lockinPeriod, final EnumOptionData lockinPeriodType, final Integer depositEvery) {
        this.id = null;
        this.status = null;
        this.externalId = null;
        this.clientId = clientId;
        this.clientName = clientName;
        this.productId = productId;
        this.productName = productName;
        this.productType = productType;
        this.currencyData = currency;
        this.savingsDepositAmountPerPeriod = savingsDepositAmountPerPeriod;
        this.savingsFrequencyType = savingsFrequencyType;
        this.totalDepositAmount = null;
        this.recurringInterestRate = interestRate;
        this.savingInterestRate = interestRate;
        this.interestType = interestType;
        this.interestCalculationMethod = interestCalculationMethod;
        this.tenure = tenure;
        this.tenureType = tenureType;
        this.projectedCommencementDate = new LocalDate();
        this.actualCommencementDate = null;
        this.maturesOnDate = null;
        this.projectedInterestAccuredOnMaturity = null;
        this.actualInterestAccured = null;
        this.projectedMaturityAmount = null;
        this.actualMaturityAmount = null;
        this.preClosureAllowed = true;
        this.preClosureInterestRate = null;
        this.withdrawnonDate = null;
        this.rejectedonDate = null;
        this.closedonDate = null;
        this.isLockinPeriodAllowed = lockinPeriodAllowed;
        this.lockinPeriod = lockinPeriod;
        this.lockinPeriodType = lockinPeriodType;
        this.depositEvery = depositEvery;
        this.productOptions = null;
        this.currencyOptions = null;
        this.savingsProductTypeOptions = null;
        this.tenureTypeOptions = null;
        this.savingFrequencyOptions = null;
        this.savingsInterestTypeOptions = null;
        this.lockinPeriodTypeOptions = null;
        this.interestCalculationOptions = null;
        this.savingScheduleDatas = null;
        this.permissions = null;
        this.outstandingAmount = BigDecimal.ZERO;
        this.dueAmount = BigDecimal.ZERO;
        this.savingScheduleData = null;
        this.transactions = null;
        this.interestPostEvery = 3;
        this.interestPostFrequency = savingsFrequencyType;
    }

    public SavingAccountData(final SavingAccountData account, final SavingPermissionData permissions) {
        this.id = account.id;
        this.status = account.status;
        this.externalId = account.externalId;
        this.clientId = account.clientId;
        this.clientName = account.clientName;
        this.productId = account.productId;
        this.productName = account.productName;
        this.productType = account.productType;
        this.currencyData = account.currencyData;
        this.savingsDepositAmountPerPeriod = account.savingsDepositAmountPerPeriod;
        this.savingsFrequencyType = account.savingsFrequencyType;
        this.totalDepositAmount = account.totalDepositAmount;
        this.recurringInterestRate = account.recurringInterestRate;
        this.savingInterestRate = account.savingInterestRate;
        this.interestType = account.interestType;
        this.interestCalculationMethod = account.interestCalculationMethod;
        this.tenure = account.tenure;
        this.tenureType = account.tenureType;
        this.projectedCommencementDate = account.projectedCommencementDate;
        this.actualCommencementDate = account.actualCommencementDate;
        this.maturesOnDate = account.maturesOnDate;
        this.projectedInterestAccuredOnMaturity = account.projectedInterestAccuredOnMaturity;
        this.actualInterestAccured = account.actualInterestAccured;
        this.projectedMaturityAmount = account.projectedMaturityAmount;
        this.actualMaturityAmount = account.actualMaturityAmount;
        this.preClosureAllowed = account.preClosureAllowed;
        this.preClosureInterestRate = account.preClosureInterestRate;
        this.withdrawnonDate = account.withdrawnonDate;
        this.rejectedonDate = account.rejectedonDate;
        this.closedonDate = account.closedonDate;
        this.isLockinPeriodAllowed = account.isLockinPeriodAllowed;
        this.lockinPeriod = account.lockinPeriod;
        this.lockinPeriodType = account.lockinPeriodType;
        this.depositEvery = account.depositEvery;

        this.productOptions = account.productOptions;
        this.currencyOptions = account.currencyOptions;
        this.savingsProductTypeOptions = account.savingsProductTypeOptions;
        this.tenureTypeOptions = account.tenureTypeOptions;
        this.savingFrequencyOptions = account.savingFrequencyOptions;
        this.savingsInterestTypeOptions = account.savingsInterestTypeOptions;
        this.lockinPeriodTypeOptions = account.lockinPeriodTypeOptions;
        this.interestCalculationOptions = account.interestCalculationOptions;
        this.savingScheduleDatas = account.savingScheduleDatas;
        this.permissions = permissions;
        this.outstandingAmount = account.outstandingAmount;
        this.dueAmount = account.dueAmount;
        this.savingScheduleData = account.savingScheduleData;
        this.transactions = account.transactions;
        this.interestPostEvery = account.interestPostEvery;
        this.interestPostFrequency = account.interestPostFrequency;
    }

    public SavingAccountData(final SavingAccountData account, final SavingScheduleData savingScheduleData) {
        this.id = account.id;
        this.status = account.status;
        this.externalId = account.externalId;
        this.clientId = account.clientId;
        this.clientName = account.clientName;
        this.productId = account.productId;
        this.productName = account.productName;
        this.productType = account.productType;
        this.currencyData = account.currencyData;
        this.savingsDepositAmountPerPeriod = account.savingsDepositAmountPerPeriod;
        this.savingsFrequencyType = account.savingsFrequencyType;
        this.totalDepositAmount = account.totalDepositAmount;
        this.recurringInterestRate = account.recurringInterestRate;
        this.savingInterestRate = account.savingInterestRate;
        this.interestType = account.interestType;
        this.interestCalculationMethod = account.interestCalculationMethod;
        this.tenure = account.tenure;
        this.tenureType = account.tenureType;
        this.projectedCommencementDate = account.projectedCommencementDate;
        this.actualCommencementDate = account.actualCommencementDate;
        this.maturesOnDate = account.maturesOnDate;
        this.projectedInterestAccuredOnMaturity = account.projectedInterestAccuredOnMaturity;
        this.actualInterestAccured = account.actualInterestAccured;
        this.projectedMaturityAmount = account.projectedMaturityAmount;
        this.actualMaturityAmount = account.actualMaturityAmount;
        this.preClosureAllowed = account.preClosureAllowed;
        this.preClosureInterestRate = account.preClosureInterestRate;
        this.withdrawnonDate = account.withdrawnonDate;
        this.rejectedonDate = account.rejectedonDate;
        this.closedonDate = account.closedonDate;
        this.isLockinPeriodAllowed = account.isLockinPeriodAllowed;
        this.lockinPeriod = account.lockinPeriod;
        this.lockinPeriodType = account.lockinPeriodType;
        this.depositEvery = account.depositEvery;

        this.productOptions = account.productOptions;
        this.currencyOptions = account.currencyOptions;
        this.savingsProductTypeOptions = account.savingsProductTypeOptions;
        this.tenureTypeOptions = account.tenureTypeOptions;
        this.savingFrequencyOptions = account.savingFrequencyOptions;
        this.savingsInterestTypeOptions = account.savingsInterestTypeOptions;
        this.lockinPeriodTypeOptions = account.lockinPeriodTypeOptions;
        this.interestCalculationOptions = account.interestCalculationOptions;
        this.savingScheduleDatas = account.savingScheduleDatas;
        this.permissions = account.permissions;
        this.outstandingAmount = account.outstandingAmount;
        this.dueAmount = account.dueAmount;
        this.savingScheduleData = savingScheduleData;
        this.transactions = account.transactions;
        this.interestPostEvery = account.interestPostEvery;
        this.interestPostFrequency = account.interestPostFrequency;
    }

    public SavingAccountData(final SavingAccountData account, final Collection<SavingAccountTransactionsData> transactions) {
        this.id = account.id;
        this.status = account.status;
        this.externalId = account.externalId;
        this.clientId = account.clientId;
        this.clientName = account.clientName;
        this.productId = account.productId;
        this.productName = account.productName;
        this.productType = account.productType;
        this.currencyData = account.currencyData;
        this.savingsDepositAmountPerPeriod = account.savingsDepositAmountPerPeriod;
        this.savingsFrequencyType = account.savingsFrequencyType;
        this.totalDepositAmount = account.totalDepositAmount;
        this.recurringInterestRate = account.recurringInterestRate;
        this.savingInterestRate = account.savingInterestRate;
        this.interestType = account.interestType;
        this.interestCalculationMethod = account.interestCalculationMethod;
        this.tenure = account.tenure;
        this.tenureType = account.tenureType;
        this.projectedCommencementDate = account.projectedCommencementDate;
        this.actualCommencementDate = account.actualCommencementDate;
        this.maturesOnDate = account.maturesOnDate;
        this.projectedInterestAccuredOnMaturity = account.projectedInterestAccuredOnMaturity;
        this.actualInterestAccured = account.actualInterestAccured;
        this.projectedMaturityAmount = account.projectedMaturityAmount;
        this.actualMaturityAmount = account.actualMaturityAmount;
        this.preClosureAllowed = account.preClosureAllowed;
        this.preClosureInterestRate = account.preClosureInterestRate;
        this.withdrawnonDate = account.withdrawnonDate;
        this.rejectedonDate = account.rejectedonDate;
        this.closedonDate = account.closedonDate;
        this.isLockinPeriodAllowed = account.isLockinPeriodAllowed;
        this.lockinPeriod = account.lockinPeriod;
        this.lockinPeriodType = account.lockinPeriodType;
        this.depositEvery = account.depositEvery;

        this.productOptions = account.productOptions;
        this.currencyOptions = account.currencyOptions;
        this.savingsProductTypeOptions = account.savingsProductTypeOptions;
        this.tenureTypeOptions = account.tenureTypeOptions;
        this.savingFrequencyOptions = account.savingFrequencyOptions;
        this.savingsInterestTypeOptions = account.savingsInterestTypeOptions;
        this.lockinPeriodTypeOptions = account.lockinPeriodTypeOptions;
        this.interestCalculationOptions = account.interestCalculationOptions;
        this.savingScheduleDatas = account.savingScheduleDatas;
        this.permissions = account.permissions;
        this.outstandingAmount = account.outstandingAmount;
        this.dueAmount = account.dueAmount;
        this.savingScheduleData = account.savingScheduleData;
        this.transactions = transactions;
        this.interestPostEvery = account.interestPostEvery;
        this.interestPostFrequency = account.interestPostFrequency;
    }

    public EnumOptionData getStatus() {
        return this.status;
    }

    public CurrencyData getCurrencyData() {
        return this.currencyData;
    }

    public BigDecimal getSavingsDepostiAmountPerPeriod() {
        return this.savingsDepositAmountPerPeriod;
    }

    public Integer getTenure() {
        return this.tenure;
    }

    public EnumOptionData getTenureType() {
        return this.tenureType;
    }

    public LocalDate getActualCommencementDate() {
        return this.actualCommencementDate;
    }

    public LocalDate getMaturesOnDate() {
        return this.maturesOnDate;
    }

    public Integer getDepositEvery() {
        return this.depositEvery;
    }

    public BigDecimal getOutstandingAmount() {
        return this.outstandingAmount;
    }
}