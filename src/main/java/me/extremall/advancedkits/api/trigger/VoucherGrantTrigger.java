package me.extremall.advancedkits.api.trigger;

import me.extremall.advancedkits.voucher.Voucher;
import org.jetbrains.annotations.Nullable;

public interface VoucherGrantTrigger extends GrantTrigger
{
    @Nullable Voucher getVoucher();

    int getAmount();
}
