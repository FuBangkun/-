package com.FuBangkun.yxxq;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(
    modid = "yxxq",
    name = "YXXQ",
    version = "0.0.1",
    dependencies =
            "required-after:galacticraftcore;" +
                    "after:galacticraftplanets;" +
                    "after:galaxyspace;" +
                    "after:exoplanets;" +
                    "after:moreplanets;" +
                    "after:asmodeuscore;" +
                    "after:starmaker;" +
                    "after:moreplanets;" +
                    "after:sol"
)
public class YXXQ {
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        Logger logger = event.getModLog();
    }
}
