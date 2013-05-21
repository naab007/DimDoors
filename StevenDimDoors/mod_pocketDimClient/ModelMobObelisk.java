// Date: 2/4/2013 6:55:29 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package StevenDimDoors.mod_pocketDimClient;



import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMobObelisk extends ModelBase
{
  //fields
    ModelRenderer wholemonolith;
  
  public ModelMobObelisk()
  {
    textureWidth = 256;
    textureHeight = 256;
    
      wholemonolith = new ModelRenderer(this, 0, 1);
      wholemonolith.addBox(0F, 0F, 0F, 64, 144, 16);
      wholemonolith.setRotationPoint(-32F, -72F, -8F);
      wholemonolith.setTextureSize(256, 256);
      wholemonolith.mirror = true;
      setRotation(wholemonolith, 0F, 0F, 0F);
  }
  
  @Override
  public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7) 
  {
	  super.render(par1Entity, par2, par3, par4, par5, par4, par7);
	    setRotationAngles(par2,  par3,  par4,  par5,  par6,par7,  par1Entity);
	    wholemonolith.render(par7);
  }
  
  
  
  //@Override
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  @Override
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) 
  {
    super.setRotationAngles( par1,  par2,  par3,  par4,  par5,  par6,  par7Entity);
  }

}