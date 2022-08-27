/**
 *		Originally generated from MCreator.
 *		After edited in IntelliJ IDEA.
 *
 *		It's no longer MCreator project.
 *		Because the MCreator is suck.
 *
 */
package net.apucsw.powered_defences.util;

import net.minecraft.world.damagesource.DamageSource;

public class AdditionalDamageSource extends DamageSource {
	public static final DamageSource ELECTRIC_SHOCK = (new AdditionalDamageSource("electric_shock")).bypassMagic();
	public static final DamageSource FORCEFIELD_SHOCK = (new AdditionalDamageSource("forcefield_shock")).bypassMagic();
	public static final DamageSource FORCEFIELD_SLICE = (new AdditionalDamageSource("forcefield_slice")).bypassArmor().bypassMagic().bypassInvul();
	public static final DamageSource DISINTEGRATION = (new AdditionalDamageSource("disintegration")).bypassArmor().bypassMagic().bypassInvul();
	public static final DamageSource LASER_SLICE = (new AdditionalDamageSource("laser_slice")).bypassArmor().bypassMagic();

	public AdditionalDamageSource(String p_i1566_1b_) {
		super(p_i1566_1b_);
	}
}
