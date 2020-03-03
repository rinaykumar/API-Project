import java.util.*;

public class ItemsDTOList {
    public final List<ItemsDTO> items;

    public ItemsDTOList(List<ItemsDTO> items) {
        this.items = items;
    }
}

// May not be needed, list of items/etc can be stored in DAO?