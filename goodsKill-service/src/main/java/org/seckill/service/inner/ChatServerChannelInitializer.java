package org.seckill.service.inner;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.handler.codec.serialization.ClassResolvers;
import io.netty.handler.codec.serialization.ObjectDecoder;
import lombok.extern.slf4j.Slf4j;

/**
 * @author heng
 */
@Slf4j
public class ChatServerChannelInitializer extends ChannelInitializer {

    @Override
    protected void initChannel(Channel ch) {
        ch.pipeline().addLast(new ObjectDecoder(Integer.MAX_VALUE, ClassResolvers.cacheDisabled(null))).addLast(new ChatServerHandler());
    }

}
