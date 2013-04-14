package dk.autointents.m2m

import IntentDSL.Intent

class TransformTest {
	def void invoke(Intent intent) {
		println(intent.name);
			for (ret: intent.returnData) {
				println(ret.toString())
			}
	}
}