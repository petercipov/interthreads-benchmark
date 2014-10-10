package com.petercipov;

import com.petercipov.holders.SynchronizedHolder;
import com.petercipov.holders.UnsafeHolder;
import com.petercipov.holders.VolatileHolder;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Group;
import org.openjdk.jmh.annotations.GroupThreads;

public class SingleWriterMultipleReaderBenchmark {

    @Benchmark
	@Group("unsafe")
	@GroupThreads(1)
    public void unsafeWriter(UnsafeHolder holder) {
        holder.set(new Object());
    }
	
	@Benchmark
	@Group("unsafe")
	@GroupThreads(3)
    public Object unsafeReaders(UnsafeHolder holder) {
        return holder.get();
    }
	
	@Benchmark
	@Group("synchronized")
	@GroupThreads(1)
    public void synchronizedWriter(SynchronizedHolder holder) {
        holder.set(new Object());
    }
	
	@Benchmark
	@Group("synchronized")
	@GroupThreads(3)
    public Object synchronizedReaders(SynchronizedHolder holder) {
        return holder.get();
    }
	
	@Benchmark
	@Group("volatile")
	@GroupThreads(1)
    public void volatileWriter(VolatileHolder holder) {
        holder.set(new Object());
    }
	
	@Benchmark
	@Group("volatile")
	@GroupThreads(3)
    public Object volatileReaders(VolatileHolder holder) {
        return holder.get();
    }

}
