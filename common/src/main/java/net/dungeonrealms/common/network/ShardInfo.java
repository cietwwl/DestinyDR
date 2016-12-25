package net.dungeonrealms.common.network;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Optional;

/**
 * Class written by APOLLOSOFTWARE.IO on 7/12/2016
 */

@NoArgsConstructor
public enum ShardInfo implements Serializable {

    // DEVELOPMENT SHARD //
    US0("US-0", "us0", new ServerAddress("131.153.27.42", 40011)),

    // US 1 SHARD //
    US1("US-1", "us1", new ServerAddress("131.153.25.42", 42000)),

    // US2 SHARD //
    US2("US-2", "us2", new ServerAddress("64.38.250.66", 42000)),

    // SUB 1 SHARD //
    SUB1("SUB-1", "sub1", new ServerAddress("149.56.28.32", 42000)),

    // CS 1 SHARD //
    CS1("CS-1", "cs1", new ServerAddress("192.99.200.110", 11250));


    @Getter
    private String shardID;

    @Getter
    private String pseudoName;

    @Getter
    private ServerAddress address;

    ShardInfo(String shardID, String pseudoName, ServerAddress address) {
        this.shardID = shardID;
        this.pseudoName = pseudoName;
        this.address = address;
    }


    public static ShardInfo getByPseudoName(String pseudoName) {
        Optional<ShardInfo> query = Arrays.stream(ShardInfo.values()).
                filter(info -> info.getPseudoName().equals(pseudoName)).findFirst();

        return query.isPresent() ? query.get() : null;
    }

    public static ShardInfo getByShardID(String shardID) {
        Optional<ShardInfo> query = Arrays.stream(ShardInfo.values()).
                filter(info -> info.getShardID().equals(shardID)).findFirst();

        return query.isPresent() ? query.get() : null;
    }

    public static ShardInfo getByAddress(ServerAddress address) {
        Optional<ShardInfo> query = Arrays.stream(ShardInfo.values()).
                filter(info -> info.getAddress().toString().equals(address.toString())).findFirst();

        return query.isPresent() ? query.get() : null;
    }
}