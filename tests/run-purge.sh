echo "Running Inventory Purge tests..."

SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd)"
PROJECT_DIR="${SCRIPT_DIR%/tests}"

cd "$PROJECT_DIR" || exit 1

mvn -q -f "$PROJECT_DIR/pom.xml" -Dtest=InventoryPurgeTest test
EXIT_CODE=$?

if [ $EXIT_CODE -eq 0 ]; then
    echo "✅ Inventory Purge tests passed"
    exit 0
else
    echo "❌ Inventory Purge tests failed"
    exit 1
fi

