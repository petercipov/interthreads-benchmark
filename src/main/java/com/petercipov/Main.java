package com.petercipov;

import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;

/**
 *
 * @author pcipov
 */
public class Main {
	public static void main(String[] args) throws Exception {
		 Options opts = new OptionsBuilder()
			.include(".*.Benchmark.*")
			.warmupIterations(5)
			.measurementIterations(2)
			.measurementTime(TimeValue.milliseconds(3000))
			.jvmArgsPrepend("-server")
			.forks(3)
			.build();
		new Runner(opts).run();
	}
}