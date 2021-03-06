package extracells.registries;

import extracells.block.BlockCertusTank;
import extracells.item.ItemBlockCertusTank;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.StatCollector;

public enum BlockEnum {
    CERTUSTANK("certustank.name", 509, new BlockCertusTank(), ItemBlockCertusTank.class);
    private final String internalName;
    private int Id;
    private Block block;
    private Class<? extends ItemBlock> itemBlockClass;

    BlockEnum(String _internalName, int _Id, Block _block) {
        this(_internalName, _Id, _block, ItemBlock.class);
    }

    BlockEnum(String _internalName, int _Id, Block _block, Class<? extends ItemBlock> _itemBlockClass) {
        internalName = _internalName;
        Id = _Id;
        block = _block;
        block.setBlockName("extracells." + internalName);
        itemBlockClass = _itemBlockClass;
    }

    public String getInternalName() {
        return internalName;
    }

    public String getStatName() {
        return StatCollector.translateToLocal(block.getUnlocalizedName().replace("tile.", "block."));
    }

    public void setId(int id) {
        this.Id = id;
    }

    public int getId() {
        return Id;
    }

    public Block getBlock() {
        return block;
    }

    public Class<? extends ItemBlock> getItemBlockClass() {
        return itemBlockClass;
    }
}
