package net.citizensnpcs.trait.waypoint;

import net.minecraft.server.v1_5_R2.DamageSource;
import net.minecraft.server.v1_5_R2.EntityEnderCrystal;
import net.minecraft.server.v1_5_R2.World;

public class EntityEnderCrystalMarker extends EntityEnderCrystal {
    public EntityEnderCrystalMarker(World world) {
        super(world);
    }

    @Override
    public boolean damageEntity(DamageSource damagesource, int i) {
        return false;
    }

    @Override
    public void l_() {
    }

    @Override
    public boolean K() {
        return false;
    }
}
