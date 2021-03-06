package vintage

object Fee {
  //
  // Gas Costs and Refunds
  //
  val GAS_NULL = 0
  val GAS_ZERO = 0
  val GAS_BASE = 2
  val GAS_VERYLOW = 3
  val GAS_LOW = 5
  val GAS_MID = 8
  val GAS_HIGH = 10
  val GAS_EXTCODE = 20
  val GAS_BALANCE = 20
  val GAS_SLOAD = 50
  val GAS_JUMPDEST = 1
  val GAS_SSET = 20000
  val GAS_SRESET = 5000

  val REFUND_SCLEAR = 15000

  val GAS_SELFDESTRUCT = 0
  val GAS_SELFDESTRUCT_NEWACCOUNT = 25000
  val GAS_CREATE = 32000
  val GAS_CALL = 40
  val GAS_CALL_EIP150 = 700
  val GAS_CALLVALUE = 9000
  val GAS_CALLSTIPEND = 2300
  val GAS_NEWACCOUNT = 25000
  val GAS_EXP = 10
  val GAS_EXPBYTE = 10
  val GAS_MEMORY = 3
  val GAS_TXCREATE = 32000
  val GAS_TXDATAZERO = 4
  val GAS_TXDATANONZERO = 68
  val GAS_TX = 21000
  val GAS_LOG = 375
  val GAS_LOGDATA = 8
  val GAS_LOGTOPIC = 375
  val GAS_SHA3 = 30
  val GAS_SHA3WORD = 6
  val GAS_COPY = 3
  val GAS_BLOCKHASH = 20
  val GAS_CODEDEPOSIT = 200

  val GAS_MEMORY_QUADRATIC_DENOMINATOR = 512


  //
  // Pre-compile contract gas costs
  //
  val GAS_SHA256 = 60
  val GAS_SHA256WORD = 12

  val GAS_RIPEMD160 = 600
  val GAS_RIPEMD160WORD = 120

  val GAS_IDENTITY = 15
  val GAS_IDENTITYWORD = 3

  val GAS_ECRECOVER = 3000

  val GAS_ECADD = 500
  val GAS_ECMUL = 40000

  val GAS_ECPAIRING_BASE = 100000
  val GAS_ECPAIRING_PER_POINT = 80000
}
