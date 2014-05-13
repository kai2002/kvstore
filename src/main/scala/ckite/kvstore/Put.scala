package ckite.kvstore

import ckite.rpc.WriteCommand

case class Put[Key,Value](key: Key, value: Value) extends WriteCommand