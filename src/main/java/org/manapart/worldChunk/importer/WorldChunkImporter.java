package org.manapart.worldChunk.importer;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.ChunkDataEvent;
import net.minecraftforge.event.world.ChunkEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("worldchunk_importer")
public class WorldChunkImporter {

    public WorldChunkImporter() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onChunkEvent(ChunkEvent.Load event) {
        System.out.println("Chunk Event Load");
    }

    @SubscribeEvent
    public void onChunkDataEvent(ChunkDataEvent.Load event) {
        System.out.println("Chunk Data Event Load");
    }



}
