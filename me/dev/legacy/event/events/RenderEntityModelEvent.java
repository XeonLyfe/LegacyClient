package me.dev.legacy.event.events;

import me.dev.legacy.event.EventStage;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class RenderEntityModelEvent extends EventStage {
   public ModelBase modelBase;
   public Entity entity;
   public float limbSwing;
   public float limbSwingAmount;
   public float age;
   public float headYaw;
   public float headPitch;
   public float scale;

   public RenderEntityModelEvent(int stage, ModelBase modelBase, Entity entity, float limbSwing, float limbSwingAmount, float age, float headYaw, float headPitch, float scale) {
      super(stage);
      this.modelBase = modelBase;
      this.entity = entity;
      this.limbSwing = limbSwing;
      this.limbSwingAmount = limbSwingAmount;
      this.age = age;
      this.headYaw = headYaw;
      this.headPitch = headPitch;
      this.scale = scale;
   }
}
