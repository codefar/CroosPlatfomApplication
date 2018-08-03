namespace java com.greenleaf.erp.api.common

struct User{
  1: required string name,
  2: optional i32 age = 0,
  3: bool gender
}
