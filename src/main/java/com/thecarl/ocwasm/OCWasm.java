package com.thecarl.ocwasm;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber
@Mod(modid = OCWasm.MODID, name = OCWasm.NAME, version = OCWasm.VERSION, acceptedMinecraftVersions = "[1.12,1.12.2]", dependencies = "after:opencomputers")
public class OCWasm
{
    public static final String MODID = "ocwasm";
    public static final String NAME = "Open Computers WASM";
    public static final String VERSION = "@VERSION@";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        li.cil.oc.api.Machine.add(WasmArch.class);
        logger.info("WASM arch has been added.");
    }
}
