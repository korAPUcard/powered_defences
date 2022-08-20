/**
 * The code of this mod element is always locked.
 *
 * You can register new events in this class too.
 *
 * If you want to make a plain independent class, create it using
 * Project Browser -> New... and make sure to make the class
 * outside net.apucsw.powered_defences as this package is managed by MCreator.
 *
 * If you change workspace package, modid or prefix, you will need
 * to manually adapt this file to these changes or remake it.
 *
 * This class will be added in the mod root package.
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
