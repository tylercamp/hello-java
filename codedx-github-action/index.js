const core = require('@actions/core')
const analyze = require('./analyze')

core.info(process.version)
analyze().catch(err => core.setFailed(err.message))
