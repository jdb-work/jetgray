package ecosystem

import ecosystem.build.SomeThing

thing = new SomeThing()

assert thing != null
println "something exist"

assert thing.val() == 89
